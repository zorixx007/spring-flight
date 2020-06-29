package com.spring.flight.service;

import com.spring.flight.entity.Operator;
import com.spring.flight.entity.dto.OperatorDto;
import com.spring.flight.repository.IOperatorRepository;
import com.spring.flight.repository.IRoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OperatorService {

    private IRoleRepository roleRepository;
    private IOperatorRepository operatorRepository;

    public OperatorService ( IRoleRepository roleRepository , IOperatorRepository operatorRepository ) {
        this.roleRepository = roleRepository;
        this.operatorRepository = operatorRepository;
    }


    public Optional<Operator> findById ( long id ) {
        return operatorRepository.findById ( id );
    }

    public OperatorDto getOperator ( long id ) {
        return findById ( id )
                .map ( item -> new OperatorDto ( item.getOperatorID ( ) , item.getFirstName ( ) ,
                        item.getLastName ( ) , item.getEmail ( ) , item.getStatus ( ) , item.getRolesDto ( ) ) )
                .orElse ( null );
    }

    public List<Operator> getSortedByFirstName () {
        return operatorRepository.findAllByOrderByFirstName ( );
    }


    public Optional<Operator> findByEmail ( String str ) {
        return operatorRepository.findOperatorByEmail ( str );
    }

}
