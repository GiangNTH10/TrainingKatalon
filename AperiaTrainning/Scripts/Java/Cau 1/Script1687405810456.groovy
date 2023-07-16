ArrayList<String> list = new ArrayList<String>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9))

ArrayList<String> soChan = new ArrayList<String>()

ArrayList<String> soLe = new ArrayList<String>()

for (int i = 0; i < list.size(); i++) {
    if (((list[i]) % 2) == 0) {
        soChan.add(list[i])
    } else {
        soLe.add(list[i])
    }
}

System.out.println('Day so: ' + list)

System.out.println('Day so chan: ' + soChan)

System.out.println('Day so le: ' + soLe)