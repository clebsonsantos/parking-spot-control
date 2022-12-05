insert into tb_user values(gen_random_uuid(), '$2a$10$1VZqgzkRrjHBj2VqbMoC3e2TE7BtOptMhvmfmfynF3kgP0rl4RbPu', 'clebson');

insert into tb_role values(gen_random_uuid(), 'ROLE_ADMIN');
insert into tb_role values(gen_random_uuid(), 'ROLE_USER');


select * from tb_user;
select * from tb_role;

insert into tb_users_roles values('user_uuid', 'role_uuid')