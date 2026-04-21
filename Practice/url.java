URL url = new URL("http://example.com");

URLConnection con = url.openConnection();

InputStream in = con.getInputStream();

int i;
while((i = in.read()) != -1){
    System.out.print((char)i);
}

