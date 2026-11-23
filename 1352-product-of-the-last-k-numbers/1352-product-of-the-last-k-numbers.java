class ProductOfNumbers {

    ArrayList<Integer> arr=new ArrayList<>();

    public ProductOfNumbers() {
        arr.add(1);
    }

    
    public void add(int num) {
        if(num==0){
            arr=new ArrayList<>();
            arr.add(1);
        }else{
            arr.add(arr.get(arr.size()-1)*num);
        }
        
    }
    
    public int getProduct(int k) {
        int n=arr.size();
        if(k>=n){
            return 0;
        }
        return arr.get(n-1)/arr.get(n-1-k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */