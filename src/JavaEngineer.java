import java.util.Scanner;

class JavaEngineer {
    //以下是JAva工程师的资料，在输入Java工程师资料室输入的内容
    static int engNo = -1;       //编号
    static String engName = "";  //姓名
    static String engSex = "";      //性别（1：男  2：女）
    static String engEdu = "";          //学历（1：大专 2：本科 3：硕士 4：博士 5：其他）
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
                    inputEngInf();
                    break;
                case 2:
                    deleteEngInf();
                    break;
                case 3:
                    searchEngInf();
                    break;
                case 4:
                    modifyEngInf();
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

    /*
    1.输入Java工程师资料
     */
    public static void inputEngInf() {
        if (status == true) {
            System.out.println("Java工程师资料已经输入完毕，可以输入4进行修改");
        } else {
            while (!status) {
                System.out.println("请输入Java工程师的编号");
                engNo = input.nextInt();
                if (engNo <= 0) {
                    status = false;
                    System.out.println("Java工程师编号不能是复数");
                    continue;
                } else {
                    status = true;
                }

                System.out.println("请输入Java工程师的姓名");
                engName = input.next();
                if (engName.length() == 0) {
                    status = false;
                    System.out.println("Java工程师名称不能为空");
                    continue;
                } else {
                    status = true;
                }

                System.out.println("请输入Java工程师的性别（1：男 2：女）");
                int engSexNo = input.nextInt();
                if (engSexNo != 1 && engSexNo != 2) {
                    status = false;
                    System.out.println("请输入1或2表示性别");
                    continue;
                } else {
                    if (engSexNo == 1) {
                        engSex = "男";
                    } else {
                        engSex = "女";
                    }
                    status = true;
                }

                System.out.println("请输入Java工程师的学历");
                System.out.println("1：大专 2：本科 3：硕士 4：博士 5：其他");
                int engEduNo = input.nextInt();
                if (engEduNo != 1 && engEduNo != 2 && engEduNo != 3 && engEduNo != 4 && engEduNo != 5) {
                    status = false;
                    System.out.println("请输入以下数字代表学历");
                    System.out.println("1：大专 2：本科 3：硕士 4：博士 5：其他");
                    continue;
                } else {
                    if (engEduNo == 1) {
                        engEdu = "大专";
                    } else if (engEduNo == 2) {
                        engEdu = "本科";
                    } else if (engEduNo == 3) {
                        engEdu = "硕士";
                    } else if (engEduNo == 4) {
                        engEdu = "博士";
                    } else {
                        engEdu = "其他";
                    }
                    status = true;
                }

                System.out.println("请输入Java工程师的底薪");
                basSalary = input.nextInt();
                if (basSalary <= 0) {
                    status = false;
                    System.out.println("Java工程师底薪必须为正数");
                    continue;
                } else {
                    status = true;
                }

                System.out.println("请输入Java工程师月应扣保险金额");
                insurance = input.nextInt();
                if (insurance <= 0) {
                    status = false;
                    System.out.println("Java工程师月应扣保险金额必须为正数");
                    continue;
                } else {
                    status = true;
                }
            }
        }
    }

    /*
    2.删除Java工程师资料
     */
    public static void deleteEngInf() {
        while (true) {
            int DelNo;
            System.out.println("请输入想要删除的Java工程师的编号");
            DelNo = input.nextInt();
            if (DelNo == engNo) {
                engNo = -1;
                engName = "";
                engSex = "";
                engEdu = "";
                basSalary = 3000;
                insurance = 3000 * 0.105;
                System.out.println("已删除Java工程师的信息");
                continue;
            } else if (DelNo == 0) {
                break;
            } else {
                System.out.println("没有这个工程师");
                continue;
            }
        }
    }

    /*
    3.查询Java工程师资料
     */
    public static void searchEngInf() {
        int seaNO = 1;

        while (true) {
            if (seaNO == 1) {
                System.out.println("以下是Java工程师资料");
                System.out.print(engNo);
                System.out.print("\t" + engName);
                System.out.print("\t" + engSex);
                System.out.print("\t" + engEdu);
                System.out.print("\t" + basSalary);
                System.out.println("\t" + insurance);
                System.out.println("输入0退出");
                seaNO = input.nextInt();
            } else {
                break;
            }
        }
    }

    /*
    4.修改Java工程师资料
     */
    public static void modifyEngInf() {
        System.out.println("Java工程师的编号" + engNo);
        System.out.println("请输入Java工程师的编号");
        engNo = input.nextInt();
        if (engNo <= 0) {
            status = false;
            System.out.println("Java工程师编号不能是复数");
        } else {
            System.out.println("此项修改成功");
        }

        System.out.println("Java工程师的名字" + engName);
        System.out.println("请输入Java工程师的姓名");
        engName = input.next();
        if (engName.length() == 0) {
            status = false;
            System.out.println("Java工程师名称不能为空");

        } else {
            System.out.println("此项修改成功");
        }

        System.out.println("Java工程师的性别" + engSex);
        System.out.println("请输入Java工程师的性别（1：男 2：女）");
        int engSexNo = input.nextInt();
        if (engSexNo != 1 && engSexNo != 2) {
            status = false;
            System.out.println("请输入1或2表示性别");
        } else {
            if (engSexNo == 1) {
                engSex = "男";
            } else {
                engSex = "女";
            }
            System.out.println("此项修改成功");
        }

        System.out.println("Java工程师学历" + engEdu);
        System.out.println("请输入Java工程师的学历");
        System.out.println("1：大专 2：本科 3：硕士 4：博士 5：其他");
        int engEduNo = input.nextInt();
        if (engEduNo != 1 && engEduNo != 2 && engEduNo != 3 && engEduNo != 4 && engEduNo != 5) {
            status = false;
            System.out.println("请输入以下数字代表学历");
            System.out.println("1：大专 2：本科 3：硕士 4：博士 5：其他");
        } else {
            if (engEduNo == 1) {
                engEdu = "大专";
            } else if (engEduNo == 2) {
                engEdu = "本科";
            } else if (engEduNo == 3) {
                engEdu = "硕士";
            } else if (engEduNo == 4) {
                engEdu = "博士";
            } else {
                engEdu = "其他";
            }
            System.out.println("此项修改成功");
        }

        System.out.println("Java工程师的底薪" + basSalary);
        System.out.println("请输入Java工程师的底薪");
        basSalary = input.nextInt();
        if (basSalary <= 0) {
            status = false;
            System.out.println("Java工程师底薪必须为正数");
        } else {
            System.out.println("此项修改成功");
        }

        System.out.println("Java工程师月应扣保险金额" + insurance);
        System.out.println("请输入Java工程师月应扣保险金额");
        insurance = input.nextInt();
        if (insurance <= 0) {
            status = false;
            System.out.println("Java工程师月应扣保险金额必须为正数");
        } else {
            System.out.println("此项修改成功");
        }
    }
}
