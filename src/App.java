import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.nextLine();
        List<String> list = new ArrayList<>();
        List<String> result = new ArrayList<>();
        String[] arr = new String[a];

        for(int i = 0; i < a ; i++){
            String temp = sc.nextLine();
            list.add(temp);
        }

        for(int i = 0; i < a; i++){
            if(!list.get(i).equals("P=NP")){
                arr = list.get(i).split("\\+");
                int soma = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
                result.add(String.valueOf(soma));
            }else{
                result.add("skipped");
            }

        }

        for (String p : result) {
            System.out.println(p);
        }

        sc.close();
        
    }
}
