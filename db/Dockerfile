FROM db
COPY ./script.sh /script.sh
COPY ./script.sql /script.sql
ENTRYPOINT ["/script.sh"]
RUN service mariadb restart; mysql </script.sql
RUN service maridb stop