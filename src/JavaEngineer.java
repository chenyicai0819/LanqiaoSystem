import java.util.Scanner;

class JavaEngineer {
    //以下是JAva工程师的资料，在输入Java工程师资料室输入的内容
    static int engNo = -1;       //编号
    static String engName = "";  //姓名
    static int engSex = -1;      //性别（1：男  2：女）
    static int engEdu = -1;          //学历（1：大专 2：本科 3：硕士 4：博士 5：其他）
    static int basSalary = 3000;    //底薪
    static double insurance = 3000 * 0.105;   //保险金额
    //以下时Java工程师月工作资料，在计算月薪时输入
    static int comResult = 100;      //月工作完成分数（最小：0 最大：150）
    static double workDay = 22;    //实际工作天数
    //以下是由Java工程师资料和Java工程师月工作情况资料计算出的Java工程师的月薪
    static double engSalary = 0.0;  //月薪
    static int userSel;         //用户在主界面上选择的输入
    static boolean status = false;  //status表示Java工程师资料是否输入完毕
    //注意：不包括Java工程师月工作情况资料
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double engSalary = 0.0;
        int basSalary = 3000;
        int comResult = 100;
        double workDay = 22;
        double insurance = 3000 * 0.105;

        Scanner input = new Scanner(System.in);
        int userSel = -1;
        while (true) {
            userSel = showMenu();
            switch (userSel) {
                case 1:
                    System.out.println("a");
                    break;
                case 2:
                    System.out.println("a");
                    break;
                case 3:
                    System.out.println("a");
                    break;
                case 4:
                    System.out.println("a");
                    break;
                case 5:
                    System.out.println("请输入Java工程师底薪");
                    basSalary = input.nextInt();
                    System.out.println("请输入Java工程师月工作完成分数（最小值为0，最大值为150）");
                    comResult = input.nextInt();
                    System.out.println("请输入Java工程师月实际工作天数");
                    workDay = input.nextInt();
                    System.out.println("请输入Java工程师月应扣保险数");
                    insurance = input.nextInt();
                    engSalary = basSalary + basSalary * 0.25 * comResult / 100 + 15 * workDay - insurance;
                    /*
                    月薪=底薪+底薪*25%*月工作完成分数/100+15*月实际工作天数-月应扣保险数
                    */
                    System.out.println("Java工程师月薪为：" + engSalary);
                    break;
                case 6:
                    System.out.println("a");
                    break;
                case 7:
                    System.out.println("a");
                    break;
                case 8:
                    System.out.println("a");
                    break;
                case 9:
                    System.out.println("a");
                    break;
                case 10:
                    System.out.println("a");
                    break;
                case 11:
                    System.out.println("a");
                    break;
                case 0:
                    System.out.println("程序结束");
                    break;
                default:
                    System.out.println("数据输入错误");
                    break;
            }
            if (userSel == 0)//用户输入0时，退出while循环，程序停止运行
            {
                break;
            }
        }
    }

    public static int showMenu() {
        System.out.println("________________________");
        System.out.println("|  蓝桥Java工程师管理系统  |");
        System.out.println("________________________");
        System.out.println("1.输入Java工程师资料");
        System.out.println("2.删除指定Java工程师资料");
        System.out.println("3.查询Java工程师资料");
        System.out.println("4.修改Java工程师资料");
        System.out.println("5.计算Java工程师的月薪");
        System.out.println("6.保存新添加的工程师资料");
        System.out.println("7.对Java工程师信息排序（1 编号升序，2 姓名升序）");
        System.out.println("8.输出所有Java工程师资料");
        System.out.println("9.清空所有Java工程师数据");
        System.out.println("10.打印Java工程师数据报表");
        System.out.println("11.从文件重新导入Java工程师数据");
        System.out.println("0.结束（编辑工程师信息后提示保存）");
        System.out.println("请输入您的选择");
        userSel = input.nextInt();
        return userSel;
    }

}
