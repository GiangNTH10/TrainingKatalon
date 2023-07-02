Scanner scanner = new Scanner(System.in)

System.out.println('Nhap chieu dai cua mang')

int n = scanner.nextInt()

HashMap hashmap = new HashMap()

if (n > 0) {
    for (int i = 1; i <= n; i++) {
        hashmap.put('Key_' + i, 'Value_' + i)
    }
    
    System.out.println('HashMap: ' + hashmap)
	} 

else 
	{
    System.out.println('HashMap khong co phan tu nao')
	}