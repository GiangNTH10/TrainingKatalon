ArrayList<String> list = new ArrayList<String>(Arrays.asList('Java', 'C#', 'C++', 'PyThon', 'Golang', 'Swift', 'Scartch'))

Scanner sc = new Scanner(System.in)

System.out.print('Nhap vi tri index: ')

Scanner input = new Scanner(System.in)

int index = input.nextInt()

if ((index <= 0) || (index > list.size)) 
	{
    System.out.println('Khong tim thay index ' + index)
	} 
else 
	{
    System.out.println((('Value cua ' + index) + ' la ') + (list[--index]))
	}