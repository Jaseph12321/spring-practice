package com.practice.service;
import com.practice.model.Meal;
import org.springframework.stereotype.Service;
import com.practice.model.Order;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService{


    List<Order> orderList = new ArrayList<>();
    Order theOrder = new Order();
    public OrderService(List<Order> orderList) {
        List<Meal> meals = new ArrayList<>();
        meals.add(new Meal("hamburger", 123, "This is delicious"));
        this.orderList.add(new Order("1", 1000, "Bill", meals));
        this.orderList.add(new Order("2", 2000,"Bill", meals));
        theOrder.setIncome(this.orderList);
    }

    public Order getOrderBySeq(String seq){
        for(int i=0;i<this.orderList.size();i++){
            if(this.orderList.get(i).getSeq().equals(seq)){
                return this.orderList.get(i);
            }

        }
        return null;
    }

    public Order getIncome(){
        return this.theOrder;
    }
}


//public class OrderService {
//    Order theorder = new Order("1", 1000,"Bill", new ArrayList<>());
//    public OrderService(Order theorder){
//        this.theorder.setMeals(this.theorder.getMeals(),"hamburger", 123, "This is delicious");
//    }
//
//    public Order getOrderBySeq(String Seq){
//        /*
//        if(this.theorder.getSeq()== Seq){
//           // return this.theorder;
//        }
//        */
//        //return null;
//        return this.theorder;
//    }
//}