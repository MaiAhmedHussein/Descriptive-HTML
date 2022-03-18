package team;
import java.io.FileNotFoundException;
import java.io.IOException;

import testing.test;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		test t =new test();
        t.create(new team.Hello(System.in).words());
	}

}
