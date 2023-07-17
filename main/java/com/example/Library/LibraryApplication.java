package com.example.Library;

import com.example.Library.model.Member;
import com.example.Library.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class LibraryApplication implements CommandLineRunner {

	@Autowired
	MemberRepository memberRepository;

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Member> members = memberRepository.getAllMembers();
		for(Member m : members) {
			System.out.println(m);
		}
	}
}
