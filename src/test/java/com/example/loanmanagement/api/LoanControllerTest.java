package com.example.loanmanagement.api;

import com.example.loanmanagement.application.LoanService;
import com.example.loanmanagement.domain.Loan;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;
import java.util.Arrays;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class LoanControllerTest {

    @Mock
    private LoanService loanService;

    @InjectMocks
    private LoanController loanController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllLoans() {
        when(loanService.getAllLoans()).thenReturn(Arrays.asList(new Loan()));
        ResponseEntity<?> response = loanController.getAllLoans();
        assertEquals(200, response.getStatusCodeValue());
    }

    @Test
    void testGetLoanById() {
        when(loanService.getLoanById(1L)).thenReturn(Optional.of(new Loan()));
        ResponseEntity<?> response = loanController.getLoanById(1L);
        assertEquals(200, response.getStatusCodeValue());
    }

    @Test
    void testCreateLoan() {
        when(loanService.createLoan(new Loan())).thenReturn(new Loan());
        ResponseEntity<?> response = loanController.createLoan(new Loan());
        assertEquals(200, response.getStatusCodeValue());
    }

    @Test
    void testUpdateLoan() {
        when(loanService.updateLoan(1L, new Loan())).thenReturn(new Loan());
        ResponseEntity<?> response = loanController.updateLoan(1L, new Loan());
        assertEquals(200, response.getStatusCodeValue());
    }

    @Test
    void testDeleteLoan() {
        doNothing().when(loanService).deleteLoan(1L);
        ResponseEntity<?> response = loanController.deleteLoan(1L);
        assertEquals(200, response.getStatusCodeValue());
    }
}