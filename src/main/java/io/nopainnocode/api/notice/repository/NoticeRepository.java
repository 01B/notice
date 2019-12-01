package io.nopainnocode.api.notice.repository;

import io.nopainnocode.api.notice.repository.model.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by no.pain.no.code@gmail.com
 * nopainnocode.tistory.com
 */
@RepositoryRestResource
public interface NoticeRepository extends JpaRepository<Notice, Long> {
}
