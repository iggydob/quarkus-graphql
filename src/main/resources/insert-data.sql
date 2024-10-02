INSERT INTO public.locations (id, when_created, when_modified, version, deleted, address, city, country)
VALUES  ('4668c12a-751e-4809-9ea7-a8481e30c970', '2024-10-02 15:57:41.593000', '2024-10-02 15:57:41.593000', 1, false, 'The Burrow', 'Ottery St Catchpole', 'UK'),
        ('e33476aa-4a16-4301-82b8-26f5be999abf', '2024-10-02 15:52:50.206000', '2024-10-02 15:52:50.206000', 1, false, '4 Privet Drive, Little Whinging', 'Surrey', 'UK'),
        ('6735f74a-a952-4d94-ac8a-e2ded4484d01', '2024-10-02 16:02:24.919000', '2024-10-02 16:02:24.919000', 1, false, '8 Heathgate, Hampstead Garden Suburb', 'London', 'UK');

INSERT INTO public.address_book (id, when_created, when_modified, version, deleted, phone_number, email_address)
VALUES  ('d5a77f84-0a5d-46fa-a837-768d156c6e50', '2024-10-02 15:52:50.206000', '2024-10-02 15:52:50.206000', 1, false, '+3598881234567', 'h.potter@hogwarts.com'),
        ('02f01fed-17b5-40fe-b5e7-13b04b582550', '2024-10-02 15:57:41.593000', '2024-10-02 15:57:41.593000', 1, false, '+359888234567', 'r.easley@hogwarts.com'),
        ('a9306d35-ff87-48aa-add8-666cca043a5f', '2024-10-02 16:02:24.917000', '2024-10-02 16:02:24.917000', 1, false, '+359888345678', 'h.granger@hogwarts.com');

INSERT INTO public.users (id, when_created, when_modified, version, deleted, title, first_name, last_name, password, is_not_locked, address_id, location_id, role)
VALUES  ('d209b750-2989-49ad-afb5-29eec159b900', '2024-10-02 15:52:50.206000', '2024-10-02 15:52:50.206000', 1, false, 'Mr.', 'Harry', 'Potter', 'passme', false, 'd5a77f84-0a5d-46fa-a837-768d156c6e50', 'e33476aa-4a16-4301-82b8-26f5be999abf', 'ROLE_USER'),
        ('e522f43f-273d-4e03-8307-155058a1d274', '2024-10-02 15:57:41.593000', '2024-10-02 15:57:41.593000', 1, false, 'Mr.', 'Ron', 'Weasley', 'passme', false, '02f01fed-17b5-40fe-b5e7-13b04b582550', '4668c12a-751e-4809-9ea7-a8481e30c970', 'ROLE_USER'),
        ('cc3d30e0-ed26-4b5e-88db-df7e77f4d115', '2024-10-02 16:02:24.917000', '2024-10-02 16:02:24.917000', 1, false, 'Miss', 'Hermione', 'Granger', 'passme', false, 'a9306d35-ff87-48aa-add8-666cca043a5f', '6735f74a-a952-4d94-ac8a-e2ded4484d01', 'ROLE_USER');
