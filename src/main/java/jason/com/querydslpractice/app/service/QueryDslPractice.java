package jason.com.querydslpractice.app.service;

import jason.com.querydslpractice.app.repository.AddrRepository;
import jason.com.querydslpractice.app.repository.CnclRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.security.KeyStore;

@Service
@RequiredArgsConstructor
@Slf4j
public class QueryDslPractice {

    private final AddrRepository addrRepository;
    private final CnclRepository cnclRepository;
}
