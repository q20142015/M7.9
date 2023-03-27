public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        char[] rusalf=new char[]{'А','а','Б','б','В','в','Г','г','Д','д','Е','е','Ё','ё','Ж','ж','З','з','И','и','Й','й','К','к','Л','л','М','м','Н','н','О','о','П','п','Р','р','С','с','Т','т','У','у','Ф','ф','Х','х','Ц','ц','Ч','ч','Ш','ш','Щ','щ','ъ','Ы','ы','ь','Э','э','Ю','ю','Я','я'};
        int razmerAlf=rusalf.length;
        int[] rusalfcode=new int[razmerAlf];
        for (int j=0;j<razmerAlf;j++) {
            for (int i = 0; i <= 65535; i++) {
                if (rusalf[j]==(char)i)
            {
                rusalfcode[j]=i;
                break;
            }
            }
        }
        System.out.println( rusalfcode[63]);
    }
}
