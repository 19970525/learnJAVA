package org.cloudcore.pojo;

/**
 * @author pengjun
 * @version v1.0
 * @create 2021-09-04 21:10
 * @Description TODO
 */
public class TransferFrom {

    private String uname;
    private double total;

    public TransferFrom(String uname, double total) {
        this.uname = uname;
        this.total = total;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "transferFrom{" +
                "uname='" + uname + '\'' +
                ", total=" + total +
                '}';
    }
}
