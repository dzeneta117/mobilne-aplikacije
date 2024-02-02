package com.mobilneshop.Mobilneshop.mappers;

import com.mobilneshop.Mobilneshop.DTOMapper;
import com.mobilneshop.Mobilneshop.DTOs.UserDTO;
import com.mobilneshop.Mobilneshop.entity.User;
import com.mobilneshop.Mobilneshop.services.ProductService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper implements DTOMapper<User, UserDTO> {

    private final ProductService productService;

    @Autowired
    public UserMapper(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public User apply(UserDTO item) {
        User user = new User();
        user.setId(item.getId());
        user.setEmail(item.getEmail());
        user.setAddress(item.getAddress());
        user.setPassword(item.getPassword());
        user.setFavoriteProductIds(item.getFavoriteProductIds());

        return user;
    }
}





