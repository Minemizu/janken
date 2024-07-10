package src;

public class main {


    public static void main(String[] args) {

        player user = new player("ユーザ");

        player com = new player("CPU");


        //入力指示表示

        System.out.println("1.グー");

        System.out.println("2.チョキ");

        System.out.println("3.パー");

        System.out.println("あなたの手を選択してください。>");

        //テストコード
        System.out.println(user.getPlayerName());
        com.setPlayerName("コンピュータ");
        System.out.println(com.getPlayerName());

    }

}

