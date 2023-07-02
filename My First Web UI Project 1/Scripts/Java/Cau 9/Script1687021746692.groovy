HashMap hashmap = new HashMap()

hashmap.put('Ten', 'Giang')

hashmap.put('Nam sinh', '1989')

int yOB = Integer.parseInt(hashmap.get('Nam sinh'))

Calendar instance = Calendar.getInstance()

int currentYear = instance.get(Calendar.YEAR)

int old = currentYear - yOB

System.out.println('Hashmap: ' + hashmap)

hashmap.put('Tuoi', old)

System.out.println('Hashmap bao gom tuoi: ' + hashmap)