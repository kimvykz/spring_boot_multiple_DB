package com.aisawan.mdb.domain.service;

import com.aisawan.mdb.db2.entity.Attendance;
import com.aisawan.mdb.db2.repository.AttendanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AttendanceService {
    private final AttendanceRepository attendanceRepository;

    public List<Attendance> getAttendance(){
        return attendanceRepository.findAll();
    }
}
