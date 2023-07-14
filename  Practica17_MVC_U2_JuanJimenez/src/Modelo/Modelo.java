
package Modelo;

public class Modelo {
   private int v1;
   private int v2;
   private int v3;
   private int v4;
   private int v5;
   private int v6;
   private int total = sumar();
   private int total1 = resta();
   private int total2 = mult();
   public Modelo(){}

    public int getV1() {
        return v1;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public int getV2() {
        return v2;
    }

    public void setV2(int v2) {
        this.v2 = v2;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total1;
    }
    public int getTotal1() {
        return total1;
    }

    public void setTotal1(int total1) {
        this.total1 = total1;
    }
    public int getTotal2() {
        return total2;
    }

    public void setTotal2(int total2) {
        this.total2 = total2;
    }

    public int sumar() {
        this.total = this.v1 + this.v2;
        return this.total;
    }
    
    public int resta() {
        this.total1 = this.v3 - this.v4;
        return this.total1;
    }
    
    public int mult() {
        this.total2 = this.v5 * this.v6;
        return this.total2;
    }
    public int getV3() {
        return v3;
    }

    public void setV3(int v3) {
        this.v3 = v3;
    }
    public int getV4() {
        return v4;
    }

    public void setV4(int v4) {
        this.v4 = v4;
    }
    public int getV5() {
        return v5;
    }

    public void setV5(int v5) {
        this.v5 = v5;
    }
    public int getV6() {
        return v6;
    }

    public void setV6(int v6) {
        this.v6 = v6;
    }
    
    
    
}
