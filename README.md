# Student Enrollment and Fee Management Backend

Portfolio-ready Spring Boot + PostgreSQL backend demonstrating normalized relational modeling,
REST APIs, validation-ready JSON payloads, indexing, and an authentication boundary.

## Run
1. Create PostgreSQL database `enrollment_db`.
2. Set `DB_URL`, `DB_USERNAME`, and `DB_PASSWORD` if needed.
3. Run `mvn spring-boot:run`.
4. API base: `http://localhost:8080/api/students`.

## Notes
The repository includes a 14-table normalized reference schema in `schema.sql`.
The sample authentication endpoint is intentionally a demo boundary; replace it with a
persistent user store and signed JWT issuance before production use.

## Example
POST `/api/auth/login`
```json
{"username":"admin","password":"change-me","role":"ADMIN"}
```
