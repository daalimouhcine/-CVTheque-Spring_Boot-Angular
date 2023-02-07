package com.cvtheme.back_end.security;

import com.cvtheme.back_end.entities.StudentEntity;
import com.cvtheme.back_end.repositories.CmeRepository;
import com.cvtheme.back_end.repositories.StudentRepository;
import com.cvtheme.back_end.repositories.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailService implements UserDetailsService {

    final StudentRepository studentRepository;
    final TeacherRepository teacherRepository;
    final CmeRepository cmeRepository;

    @Override
    public UserDetails loadUserByUsername(String emailAndType) throws UsernameNotFoundException {
        String email = emailAndType.split(":")[0];
        String role = emailAndType.split(":")[1];

        return switch (role) {
            case "student" ->
                    studentRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException("Student not found"));
            case "teacher" ->
                    teacherRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException("Teacher not found"));
            case "cme" ->
                    cmeRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException("Cme not found"));

            default -> throw new UsernameNotFoundException("User not found");
        };
    }


}
