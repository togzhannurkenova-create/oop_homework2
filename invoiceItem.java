public class ntn4 {
    public static void main(String[] args) {
        
                InvoiceItem item1 = new InvoiceItem("A101", "Pen Red", 8, 0.99);
                System.out.println(item1);
                System.out.println("ID: " + item1.getID());
                System.out.println("Desc: " + item1.getDesc());
                System.out.println("Qty: " + item1.getQty());
                System.out.println("Unit Price: " + item1.getUnitPrice());
                System.out.println("Total: " + item1.getTotal());

                item1.setQty(10);
                item1.setUnitPrice(1.20);
                System.out.println("New Total: " + item1.getTotal());
            }
        }

        class InvoiceItem {
            private String id;
            private String desc;
            private int qty;
            private double unitPrice;

            public InvoiceItem(String id, String desc, int qty, double unitPrice) {
                this.id = id;
                this.desc = desc;
                this.qty = qty;
                this.unitPrice = unitPrice;
            }

            public String getID() {
                return id;
            }

            public String getDesc() {
                return desc;
            }

            public int getQty() {
                return qty;
            }

            public void setQty(int qty) {
                this.qty = qty;
            }

            public double getUnitPrice() {
                return unitPrice;
            }

            public void setUnitPrice(double unitPrice) {
                this.unitPrice = unitPrice;
            }

            public double getTotal() {
                return qty * unitPrice;
            }

            @Override
            public String toString() {
                return "InvoiceItem[id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + "]";
            }
        }