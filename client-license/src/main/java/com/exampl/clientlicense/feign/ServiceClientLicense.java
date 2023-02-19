package com.exampl.clientlicense.feign;

import com.exampl.clientlicense.FeignConfig;
import com.exampl.clientlicense.dto.LicenseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "${feign.name}", url = "${feign.url}",  configuration = FeignConfig.class)
public interface ServiceClientLicense {
    @GetMapping("all/license")
    List<LicenseDto> getAllLicense();
    @PostMapping("add")
    LicenseDto addLicense(LicenseDto dto);

//    @GetMapping("/posts/{postId}")
//    LicenseDto getPostById(@PathVariable Long postId);
//
//    @GetMapping("/posts")
//    List<Post> getPostByUserId(@RequestParam Long userId);
//
//    @PostMapping("/posts")
//    Post createPost(Post post);
//
//    @PutMapping("/posts")
//    Post updatePost(Post post);
//
//    @DeleteMapping("/posts/{postId}")
//    Post deletePost(@PathVariable Long postId);

}
