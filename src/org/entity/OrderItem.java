package org.entity;

/*
订单条目表，一个订单表可以有多个订单条目表
 */

import java.util.Date;

public class OrderItem {

    //订单编号，通过uuid生成
    private String order_no;
    //一个订单对象对应多个订单条目
    private Order order;
    //一个订单条目对应一个商品
    private Product product;
    //地址
    private String address;
    //要支付的手续费
    private Double payment;
    //选择支付的类型
    private String payment_type;

    private String subtitle;

    private Double price;

    private Double totalprice;

    private String main_image;

    private Date create_time;

    private Date update_time;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adrress) {
        this.address = adrress;
    }

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public Double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }

    public String getMain_image() {
        return main_image;
    }

    public void setMain_image(String main_image) {
        this.main_image = main_image;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public OrderItem() {
    }


    public OrderItem(String order_no, Order order, Product product, String address, Double payment, String payment_type, String subtitle, Double price, Double totalprice, String main_image, Date create_time, Date update_time) {
        this.order_no = order_no;
        this.order = order;
        this.product = product;
        this.address = address;
        this.payment = payment;
        this.payment_type = payment_type;
        this.subtitle = subtitle;
        this.price = price;
        this.totalprice = totalprice;
        this.main_image = main_image;
        this.create_time = create_time;
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "Mmall_order_itemBean{" +
                "order_no='" + order_no + '\'' +
                ", order=" + order +
                ", product=" + product +
                ", adrress='" + address + '\'' +
                ", payment=" + payment +
                ", payment_type=" + payment_type +
                ", subtitle='" + subtitle + '\'' +
                ", price=" + price +
                ", totalprice=" + totalprice +
                ", main_image='" + main_image + '\'' +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                '}';
    }
}
