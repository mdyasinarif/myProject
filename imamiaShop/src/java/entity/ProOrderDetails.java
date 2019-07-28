package entity;
// Generated May 15, 2019 4:59:16 AM by Hibernate Tools 4.3.1



/**
 * ProOrderDetails generated by hbm2java
 */
public class ProOrderDetails  implements java.io.Serializable {


     private Integer orderDetailsId;
     private ProOrder proOrder;
     private Product product;
     private int proQty;

    public ProOrderDetails() {
    }

    public ProOrderDetails(ProOrder proOrder, Product product, int proQty) {
       this.proOrder = proOrder;
       this.product = product;
       this.proQty = proQty;
    }
   
    public Integer getOrderDetailsId() {
        return this.orderDetailsId;
    }
    
    public void setOrderDetailsId(Integer orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
    }
    public ProOrder getProOrder() {
        return this.proOrder;
    }
    
    public void setProOrder(ProOrder proOrder) {
        this.proOrder = proOrder;
    }
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    public int getProQty() {
        return this.proQty;
    }
    
    public void setProQty(int proQty) {
        this.proQty = proQty;
    }




}


