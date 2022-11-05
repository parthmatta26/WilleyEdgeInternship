package com.application.electricitybill.Bill;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
public interface BillRepository extends JpaRepository<Bill, Long> {

    @Query(value="Select * From bill Where customer_id=:id" , nativeQuery = true)
    List<Bill> findBycustomerId(@Param("id") long customerId);

    @Query(value="Select * From bill Where customer_id=:id AND MONTH(bill_date) =:month", nativeQuery = true)
    Bill findExactBill(@Param("id") long customerId, @Param("month") int month);

//    @Query(value="Select * From bill Where MONTH(bill_date) =:month", nativeQuery = true)
//    Bill findExactBill(@Param("month") int month);

//    @Modifying
//    @Transactional
//    @Query(value="delete from customer where customer_id=:id" , nativeQuery = true)
//    List<Bill> findCustomerHistory(long customerId);
}
