package com.example.loanmanagement.application;

import com.example.loanmanagement.domain.Loan;
import com.example.loanmanagement.domain.LoanRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class LoanServiceTest {

    @Mock
    private LoanRepository loanRepository;

    @InjectMocks
    private LoanService loanService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllLoans() {
        when(loanRepository.findAll()).thenReturn(Arrays.asList(new Loan()));
        assertEquals(1, loanService.getAllLoans().size());
    }

    @Test
    void testGetLoanById() {
        when(loanRepository.findById(1L)).thenReturn(Optional.of(new Loan()));
        assertEquals(Optional.of(new Loan()), loanService.getLoanById(1L));
    }

    @Test
    void testCreateLoan() {
        when(loanRepository.save(new Loan())).thenReturn(new Loan());
        assertNotNull(loanService.createLoan(new Loan()));
    }

    @Test
    void testUpdateLoan() {
        when(loanRepository.existsById(1L)).thenReturn(true);
        when(loanRepository.save(new Loan())).thenReturn(new Loan());
        assertNotNull(loanService.updateLoan(1L, new Loan()));
    }

    @Test
    void testDeleteLoan() {
        doNothing().when(loanRepository).deleteById(1L);
        loanService.deleteLoan(1L);
        verify(loanRepository, times(1)).deleteById(1L);
    }
}