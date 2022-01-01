package jason.com.querydslpractice.app.service;

import jason.com.querydslpractice.app.repository.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class QueryDslPractice {

    private final AddrRepository addrRepository;
    private final CnclRepository cnclRepository;
    private final ProdMRepository prodMRepository;

    private final RcpRepository rcpRepository;

    private final RegRepository repository;

    private final ProdReposiroty prodReposiroty;
}
