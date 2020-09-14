package org.entity;

/*
订单表
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private String id;
    //一个订单应该对应一个用户
    private User user;

    private Double totalprice;
    //地址
    private String address;
    //订单的状态
    private Integer status;

    private Date send_time;

    private Date close_time;
    //一个订单应该有多个订单条目
    private List<OrderItem> orderItemBeanList = new ArrayList<>();

    public Order() {
    }

    public Order(String id, User user, Double totalprice, String address, Integer status, Date send_time, Date close_time, List<OrderItem> orderItemBeanList) {
        this.id = id;
        this.user = user;
        this.totalprice = totalprice;
        this.address = address;
        this.status = status;
        this.send_time = send_time;
        this.close_time = close_time;
        this.orderItemBeanList = orderItemBeanList;
    }

    public List<OrderItem> getOrderItemBeanList() {
        return orderItemBeanList;
    }

    public void setOrderItemBeanList(List<OrderItem> orderItemBeanList) {
        this.orderItemBeanList = orderItemBeanList;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getSend_time() {
        return send_time;
    }

    public void setSend_time(Date send_time) {
        this.send_time = send_time;
    }

    public Date getClose_time() {
        return close_time;
    }

    public void setClose_time(Date close_time) {
        this.close_time = close_time;
    }

    @Override
    public String toString() {
        return "Mmall_orderBean{" +
                "id=" + id +
                ", user=" + user +
                ", totalprice=" + totalprice +
                ", adrress='" + address + '\'' +
                ", status=" + status +
                ", send_time=" + send_time +
                ", close_time=" + close_time +
                ", orderItemBeanList=" + orderItemBeanList +
                '}';
    }
}
