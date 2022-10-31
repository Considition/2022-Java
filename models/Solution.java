package models;

public class Solution {
    public static boolean recycleRefundChoice;
    public static Integer bagPrice;
    public static Integer refundAmount;
    public static Integer bagType;
    public static List<Integer> orders = new ArrayList<>();

    public Solution() {
    }

    // true = refund decreasing with time, false = penalty after expiration time
    public void setRecycleRefundCHoice(boolean recycleRefundChoice) {
        this.recycleRefundChoice = recycleRefundChoice;
    }

    public void setBagPrice(Integer bagPrice) {
        this.bagPrice = bagPrice;
    }

    public void setRefundAmount(Integer refundAmount) {
        this.refundAmount = refundAmount;
    }

    public void setBagType(Integer bagType) {
        this.bagType = bagType;
    }

    public void setOrders(List<Integer> orders) {
        this.orders = orders;
    }
}


