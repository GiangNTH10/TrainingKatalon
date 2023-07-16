ArrayList<String> list = new ArrayList<String>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9))

System.out.println('Day so: ' + list)

for (int i = 0; i < list.size(); i++) {
    if (((list[i]) % 2) == 0) {
        list.remove(i)
    }
}

System.out.println('Day so le: ' + list)