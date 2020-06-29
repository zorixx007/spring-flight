package com.spring.flight.repository;

import com.spring.flight.entity.Operator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface IOperatorRepository extends JpaRepository<Operator, Long> {
    List<Operator> findAllByOrderByFirstName ();
    Optional<Operator> findOperatorByEmail ( String str );


    //    @Query("SELECT
    //            new com.books.flight.entity.Result (p.merchant.name, count(p), SUM(p.chargePaid))
    //            FROM
    //            payment p
    //            GROUP BY
    //            p.merchant.name")

}
