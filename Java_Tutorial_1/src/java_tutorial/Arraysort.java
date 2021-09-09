package java_tutorial;
public class Arraysort {
    public static void main(String[] args){
        int[] myarray={25,10,17,41,50,78};
        int temp=0;
        for(int i=0;i<6;i++){
            for(int k=0;k<6;k++ ){
                if(myarray[i]>myarray[k]){
                
                }else{
                    temp=myarray[i];
                    myarray[i]=myarray[k];
                    myarray[k]=temp;
                }
            }
        }
        for(int j=0;j<6;j++){
            System.out.println(myarray[j]+"");
        }
        
    }
}
