package com.example.inheritance_representation;

import com.example.inheritance_representation.joinedtable.JT_Mentor;
import com.example.inheritance_representation.joinedtable.JT_MentorRepository;
import com.example.inheritance_representation.joinedtable.JT_User;
import com.example.inheritance_representation.joinedtable.JT_UserRepository;
import com.example.inheritance_representation.mappedsuperclass.MSC_Instructor;
import com.example.inheritance_representation.mappedsuperclass.MSC_InstructorRepository;
import com.example.inheritance_representation.mappedsuperclass.MSC_Mentor;
import com.example.inheritance_representation.mappedsuperclass.MSC_MentorRepository;
import com.example.inheritance_representation.singletable.*;
import com.example.inheritance_representation.tableperclass.TPC_Mentor;
import com.example.inheritance_representation.tableperclass.TPC_MentorRepository;
import com.example.inheritance_representation.tableperclass.TPC_User;
import com.example.inheritance_representation.tableperclass.TPC_UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InheritanceInSpringBootApplicationTests {

    @Autowired
    private TPC_MentorRepository mentorRepository;
    @Autowired
    private TPC_UserRepository userRepository;

    @Autowired
    private ST_MentorRepository st_mentorRepository;
    @Autowired
    private ST_UserRepository st_userRepository;
    @Autowired
    private ST_InstructorRepository st_instructorRepository;

    @Autowired
    private JT_UserRepository jt_userRepository;
    @Autowired
    private JT_MentorRepository jt_mentorRepository;

    @Autowired
    private MSC_MentorRepository msc_mentorRepository;
    @Autowired
    private MSC_InstructorRepository msc_instructorRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void Tpc_test(){
        TPC_User user = new TPC_User();
        user.setEmail("test.user@xyz.com");
        user.setPassword("password");
        userRepository.save(user);

        TPC_Mentor mentor = new TPC_Mentor();
        mentor.setEmail("test.mentor@xyz.com");
        mentor.setPassword("mentor_password");
        mentor.setNumberOfMentees(5);
        mentor.setNumberOfSessions(10);
        mentorRepository.save(mentor);
    }

    @Test
    void St_test(){
//        ST_User user = new ST_User();
//        user.setEmail("test.user_st@xyz.com");
//        user.setPassword("password");
//        st_userRepository.save(user);

        ST_Mentor mentor = new ST_Mentor();
        mentor.setEmail("test.mentor_st@xyz.com");
        mentor.setPassword("mentor_st_password");
        mentor.setNumberOfMentees(55);
        mentor.setNumberOfSessions(100);
        st_mentorRepository.save(mentor);

        ST_Instructor instructor = new ST_Instructor();
        instructor.setExperience(20);
        instructor.setSubject("DSA");
        instructor.setEmail("st_inst@xyz.com");
        instructor.setPassword("st_inst_pass");
        st_instructorRepository.save(instructor);
    }

    @Test
    void Jt_test(){
        JT_User user = new JT_User();
        user.setEmail("test.user@xyz.com");
        user.setPassword("password");
        jt_userRepository.save(user);

        JT_Mentor mentor = new JT_Mentor();
        mentor.setEmail("test.mentor@xyz.com");
        mentor.setPassword("mentor_password");
        mentor.setNumberOfMentees(5);
        mentor.setNumberOfSessions(10);
        jt_mentorRepository.save(mentor);
    }

    @Test
    void msc_test(){

        MSC_Mentor mentor = new MSC_Mentor();
        mentor.setEmail("test.mentor_st@xyz.com");
        mentor.setPassword("mentor_st_password");
        mentor.setNumberOfMentees(55);
        mentor.setNumberOfSessions(100);
        msc_mentorRepository.save(mentor);

        MSC_Instructor instructor = new MSC_Instructor();
        instructor.setExperience(20);
        instructor.setSubject("DSA");
        instructor.setEmail("st_inst@xyz.com");
        instructor.setPassword("st_inst_pass");
        msc_instructorRepository.save(instructor);
    }

}
