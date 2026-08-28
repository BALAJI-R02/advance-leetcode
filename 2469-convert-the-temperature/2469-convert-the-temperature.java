class Solution {
    public double[] convertTemperature(double celsius) {
        double kel=celsius+273.15;
        double fah=celsius*1.80+32.00;
        double arr[]=new double[2];
        for(int i=0;i<1;i++){
            arr[i]=kel;
            arr[i+1]=fah;
        }
        return arr;
    }
}