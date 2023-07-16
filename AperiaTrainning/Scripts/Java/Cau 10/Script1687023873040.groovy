Map<String, String> map = new HashMap()

map.put('Ten', 'Giang')

map.put('Chieu cao', '1.5')

float chieuCao = Float.parseFloat(map.get('Chieu cao'))

System.out.println('Nhap can nang (kg)')

Scanner input = new Scanner(System.in)

float canNang = input.nextInt()

map.put('Can nang', +(canNang))

float bMI = canNang / (chieuCao * chieuCao)

System.out.println('Thong tin:' + map)

if (bMI < 16) {
    System.out.println(('BMI = ' + bMI) + ' - The trang cua ban la: Gay do |||')
} else if ((bMI >= 16) && (bMI < 17)) {
    System.out.println(('BMI = ' + bMI) + ' - The trang cua ban la: Gay do ||')
} else if ((bMI >= 17) && (bMI < 18.5)) {
    System.out.println(('BMI = ' + bMI) + ' - The trang cua ban la: Gay do |')
} else if ((bMI >= 18.5) && (bMI < 25)) {
    System.out.println(('BMI = ' + bMI) + ' - The trang cua ban la: Binh thuong')
} else if ((bMI >= 25) && (bMI < 30)) {
    System.out.println(('BMI = ' + bMI) + ' - The trang cua ban la: Thua can')
} else if ((bMI >= 30) && (bMI < 35)) {
    System.out.println(('BMI = ' + bMI) + ' - The trang cua ban la: Beo phi do |')
} else if ((bMI >= 35) && (bMI < 40)) {
    System.out.println(('BMI = ' + bMI) + ' - The trang cua ban la: Beo phi do ||')
} else {
    System.out.println(('BMI = ' + bMI) + ' - The trang cua ban la: Beo phi do |||')
}