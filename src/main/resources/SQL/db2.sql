CREATE TABLE public.attendances (
	att_id serial4 NOT NULL,
	user_id int4 NULL,
	att_type varchar(50) NULL,
	reg_date timestamp NULL,
	CONSTRAINT attendances_pkey PRIMARY KEY (att_id)
);

INSERT INTO public.attendances (user_id,att_type,reg_date) VALUES
	 (1,'in','2025-02-26 12:14:23.261818'),
	 (1,'in','2025-02-26 12:15:04.106358'),
	 (2,'out','2025-02-26 12:15:04.106358'),
	 (3,'in','2025-02-26 12:15:04.106358'),
	 (1,'out','2025-02-26 12:15:04.106358');
