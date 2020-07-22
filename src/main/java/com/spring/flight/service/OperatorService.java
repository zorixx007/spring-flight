package com.spring.flight.service;

import com.spring.flight.entity.Operator;
import com.spring.flight.entity.Role;
import com.spring.flight.entity.dto.OperatorDto;
import com.spring.flight.repository.IOperatorRepository;
import com.spring.flight.repository.IRoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;

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

    public Optional<Operator> getOperator ( long id ) {
        return findById ( id );
    }

    public OperatorDto getOperatorDto ( long id ) {
        return getOperator ( id )
                .map ( item -> new OperatorDto ( item.getOperatorID ( ) , item.getFirstName ( ) ,
                                item.getLastName ( ) , item.getEmail ( ) , item.getStatus ( ) ,
                                item.getRoles ( ).stream ( ).map (
                                        role -> role.getRoleName ())
                                        .collect ( Collectors.toCollection ( TreeSet::new ) )
                        )
                )
                .orElse ( null );
    }

    public List<Operator> getSortedByFirstName () {
        return operatorRepository.findAllByOrderByFirstName ( );
    }


    public Optional<Operator> findByEmail ( String str ) {
        return operatorRepository.findOperatorByEmail ( str );
    }

}
