package com.aishatmoshood.fashionblog.services.serviceimpl;

import com.aishatmoshood.fashionblog.enums.Role;
import com.aishatmoshood.fashionblog.exceptions.NotFoundException;
import com.aishatmoshood.fashionblog.exceptions.UnauthorizedException;
import com.aishatmoshood.fashionblog.models.ApiResponse;
import com.aishatmoshood.fashionblog.models.Like;
import com.aishatmoshood.fashionblog.models.Post;
import com.aishatmoshood.fashionblog.models.User;
import com.aishatmoshood.fashionblog.repositories.LikeRepository;
import com.aishatmoshood.fashionblog.repositories.PostRepository;
import com.aishatmoshood.fashionblog.services.LikeService;
import com.aishatmoshood.fashionblog.util.LoggedInUser;
import com.aishatmoshood.fashionblog.util.ResponseManager;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LikeServiceImpl implements LikeService {
    private final LikeRepository likeRepository;
    private final ResponseManager responseManager;
    private final HttpSession httpSession;
    private final LoggedInUser loggedInUser;
    private final PostRepository postRepository;
    User signedInUser = loggedInUser.findLoggedInUser();


    @Override
    public ApiResponse<Like> likeAPost(Long postId) throws UnauthorizedException {
        List<Like> likes = likeRepository.findLikesByPostId(postId);

        for(int i = 0; i < likes.size(); i++){
            if(likes.get(i).getUser() == signedInUser){
                throw new UnauthorizedException("You can't like this post more than once");
            }
        }

        Like like = new Like();
        like.setNoOfLikes(like.getNoOfLikes() + 1L);

        if(httpSession.getAttribute("userId") == null){
            User user = new User(Role.ANONYMOUS_USER);
            like.setUser(user);
        }
        else {
            like.setUser(signedInUser);
        }

        Post post = postRepository.findById(postId).get();
        like.setPost(post);

        likeRepository.save(like);
        return responseManager.success(like);
    }

    @Override
    public ApiResponse<String> unLikeAPost(Long commentId, Long postId) throws UnauthorizedException, NotFoundException {
        if(httpSession.getAttribute("userId") == null)
            throw new UnauthorizedException("Please log in to unlike a post");

        Like like = likeRepository.findById(commentId).get();

        List<Like> likes = likeRepository.findLikesByPostId(postId);
        for(int i = 0; i < likes.size(); i++){
            if(likes.get(i).getUser() == signedInUser){
                like.setNoOfLikes(like.getNoOfLikes() - 1L);
                Like userLike =likeRepository.findLikeByPostIdAndUser(postId,signedInUser);
                likeRepository.deleteById(userLike.getId());
            } else {
                throw new NotFoundException("You didn't like this post");
            }
        }

        return responseManager.success("Unliked Successfully");
    }

}
