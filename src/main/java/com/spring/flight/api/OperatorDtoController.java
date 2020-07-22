package com.spring.flight.api;

import com.spring.flight.entity.dto.OperatorDto;
import com.spring.flight.service.OperatorService;
import com.spring.flight.service.RoleService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("/users")
public class OperatorDtoController {
    private final OperatorService operatorService;
    private final RoleService roleService;

    public OperatorDtoController ( OperatorService operatorService , RoleService roleService ) {
        this.operatorService = operatorService;
        this.roleService = roleService;
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public OperatorDto getPost ( @PathVariable Long id ) {
        return operatorService.getOperatorDto ( id );
    }

}
