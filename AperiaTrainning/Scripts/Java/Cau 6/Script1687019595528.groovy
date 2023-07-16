ArrayList<String> list = new ArrayList<String>()

Scanner input = new Scanner(System.in)

int number = input.nextInt()

int i = 1

System.out.println('So N:' + number)

while (list.size() < number) {
    if ((i % number) == 0) 
	{
        list.add(i)
    }
    
    i++
}

System.out.println('Day so chia het ' + number + ' la ' + list)