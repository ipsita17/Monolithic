package com.example.Monolithic.service;



import com.example.Monolithic.entity.Address;
import com.example.Monolithic.entity.Student;
import com.example.Monolithic.repository.AddressRepository;
import com.example.Monolithic.repository.StudentRepository;
import com.example.Monolithic.request.CreateStudentRequest;
import com.example.Monolithic.response.CreateStudentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    AddressRepository addressRepository;

    public CreateStudentResponse createStudent(CreateStudentRequest createStudentRequest) {

        Address address = new Address();
        address.setStreet(createStudentRequest.getStreet());
        address.setCity(createStudentRequest.getCity());

        address = addressRepository.save(address);

        Student student = new Student();
        student.setFirstName(createStudentRequest.getFirstName());
        student.setLastName(createStudentRequest.getLastName());
        student.setEmail(createStudentRequest.getEmail());

        student.setAddress(address);
        student = studentRepository.save(student);

        return new CreateStudentResponse(student);
    }

    public CreateStudentResponse getById (long id) {
        return new CreateStudentResponse(studentRepository.findById(id).get());
    }


    public long deleteById(long id) {
      return  CreateStudentResponse.deleteById(id);
    }
}
