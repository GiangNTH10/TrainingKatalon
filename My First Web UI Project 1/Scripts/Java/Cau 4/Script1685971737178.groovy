ArrayList<String> list = new ArrayList<String>()

System.out.println('Nhap chieu dai cua mang')

Scanner input = new Scanner(System.in)

int number = input.nextInt()

System.out.println('Chieu dai mang vua nhap: ' + number)

String charactes = 'QWERTYUIOPASDFGHJKLZXCVBNM1234567890'

while (list.size() < number) {
    Random random = new Random()

    int index = random.nextInt(charactes.length())

    String j = charactes.charAt(index)

    while (list.contains(j)) {
        int index1 = random.nextInt(charactes.length())

        int index2 = random.nextInt(charactes.length())

        String j2 = charactes.charAt(index2)

        j = (j + j2)
    }
    
    list.add(j)
}

System.out.println('Chieu dai cua mang ' + list.size())

System.out.println('Tong Day so: ' + list)