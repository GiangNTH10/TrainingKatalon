ArrayList<String> list = new ArrayList<String>(Arrays.asList('Java', 'C#', 'C++', 'PyThon', 'Golang', 'Swift', 'Scartch'))

Scanner sc = new Scanner(System.in)

System.out.print('Nhap chuoi: ')

String str = sc.nextLine()

System.out.print('Chuoi ban da nhap: ' + str)

int index

int position

for (int i = 0; i < list.size(); i++) {
    if ((list[i]).equalsIgnoreCase(str)) {
        index = list.indexOf(list[i])

        position = ++index

        break
    }
}

if (position > 0) {
    System.out.println('Vi tri index la: ' + position)
	} 
else 
	{
    System.out.println('Khong tim ra vi tri index cua ' + str)
	}
