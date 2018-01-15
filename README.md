# How to use Apache Solr Data Import Handler

This project shows how you can use the Apache Solr Data Import Handler(DIH) to import data from a SQL database into a Apache Solr search index.

## Setup

### Apache Solr

#### Download and Start

The example uses Apache Solr so you must download and install the newest version:
http://lucene.apache.org/solr/mirrors-solr-latest-redir.html
  
Start Solr at the default port 8983:
    
    solr start -p 8983
    
To stop solr use:

    solr stop -p 8983
    
    
#### Configuration 

From the directory `solr` copy the folder `products` to `<solr-installation-directory>/server/solr` 

### Database

PostgreSQL is used but the example would work with any SQL database.

### Setup

There are many binaries available: https://www.postgresql.org/download/

If you don't want to install PosgreSQL you can use one of these:

- Windows: PosgreSQL Portable: https://gareth.flowers/postgresql-portable/
- Mac: Postgres.app http://postgresapp.com/

### User and Schema

1. Create a user called `user` with the same password

   `CREATE ROLE user WITH LOGIN PASSWORD 'user';` 

2. Add a database with the name `products`

`   CREATE DATABASE products;`

3. Create the table

   ` create table products
    (
    	id serial not null
    		constraint products_pkey
    			primary key,
    	description varchar(500) not null,
    	modified timestamp not null
    );`

4. Insert some data

   `INSERT INTO public.products (description, modified) VALUES ('Pen', current_timestamp);`
       

You are ready to go!

