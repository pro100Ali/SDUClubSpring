//package com.arjuncodes.studentsystem.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api")
//public class ClubController {
//    @Autowired
//    private Student studentRepository;
//
//    @Autowired
//    private ClubRepository clubRepository;
//
//    @Autowired
//    private MembershipRepository membershipRepository;
//
//    // Endpoint for registering a student to a club
//    @PostMapping("/memberships")
//    public Membership registerStudentToClub(@RequestBody Membership membership) {
//        return membershipRepository.save(membership);
//    }
//
//    // Endpoint for getting all students
//    @GetMapping("/students")
//    public List<Student> getAllStudents() {
//        return studentRepository.findAll();
//    }
//
//    // Endpoint for getting all clubs
//    @GetMapping("/clubs")
//    public List<Club> getAllClubs() {
//        return clubRepository.findAll();
//    }
//
//    // Endpoint for creating a new student
//    @PostMapping("/students")
//    public Student createStudent(@RequestBody Student student) {
//        return studentRepository.save(student);
//    }
//
//    // Endpoint for creating a new club
//    @PostMapping("/clubs")
//    public Club createClub(@RequestBody Club club) {
//        return clubRepository.save(club);
//    }
//
//    // Endpoint for deleting a membership
//    @DeleteMapping("/memberships/{id}")
//    public void deleteMembership(@PathVariable Long id) {
//        membershipRepository.deleteById(id);
//    }
//}
package com.arjuncodes.studentsystem.controller;

import com.arjuncodes.studentsystem.model.Club;
import com.arjuncodes.studentsystem.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/clubs")
@CrossOrigin
public class ClubController {
    @Autowired
    private ClubService clubService;
    @GetMapping("/{id}")
    public Club getClubById(@PathVariable int id) {
        return clubService.getClubById(id);
    }

    @PostMapping("/add")
    public String add(@RequestBody Club club){
        clubService.saveClub(club);
        return "New club is added";
    }

    @GetMapping("/getAll")
    public List<Club> list(){
        return clubService.getAllClubs();
    }
}