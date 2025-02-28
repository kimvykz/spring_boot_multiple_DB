CREATE TABLE public.users (
	user_id serial4 NOT NULL,
	"name" varchar(100) NULL,
	age int4 NULL,
	CONSTRAINT users_pkey PRIMARY KEY (user_id)
);


INSERT INTO public.users ("name",age) VALUES
	 ('Steve',30),
	 ('David',32),
	 ('Smith',33);