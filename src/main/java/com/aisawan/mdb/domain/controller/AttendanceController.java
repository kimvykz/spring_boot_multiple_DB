package com.aisawan.mdb.domain.controller;

import com.aisawan.mdb.db2.repository.AttendanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class AttendanceController {
    private final AttendanceRepository attendanceRepository;

    @GetMapping("/attendances")
    public ResponseEntity<?> getAttendance() {
        return ResponseEntity.status(HttpStatus.OK).body(
                attendanceRepository.findAll()
        );
    }
}
